package br.com.boraagendar.cliente.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.boraagendar.cliente.core.designsystem.theme.BoraAgendarTheme
import br.com.boraagendar.cliente.core.designsystem.theme.NichoTheme
import br.com.boraagendar.cliente.core.model.Nicho

@Composable
fun HomeRoute(modifier: Modifier = Modifier) {
    HomeScreen(
        nichos = nichosFixos,
        onNichoClick = {},
        modifier = modifier
    )
}

@Composable
fun HomeScreen(
    nichos: List<Nicho>,
    onNichoClick: (Nicho) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = stringResource(R.string.home_titulo),
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {
            items(nichos, key = { it.id }) { nicho ->
                NichoCard(
                    nicho = nicho,
                    onClick = { onNichoClick(nicho) }
                )
            }
        }
    }
}

@Composable
private fun NichoCard(
    nicho: Nicho,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    NichoTheme(corSemente = Color(nicho.corSemente)) {
        Card(
            onClick = onClick,
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer
            ),
            modifier = modifier
                .fillMaxWidth()
                .height(120.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(12.dp)
            ) {
                Text(
                    text = nicho.nome,
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    BoraAgendarTheme {
        HomeScreen(
            nichos = nichosFixos,
            onNichoClick = {}
        )
    }
}
