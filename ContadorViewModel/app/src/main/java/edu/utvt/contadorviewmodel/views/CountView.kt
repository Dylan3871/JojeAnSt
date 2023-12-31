package edu.utvt.contadorviewmodel.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import edu.utvt.contadorviewmodel.components.CurrentValueCounter
import edu.utvt.contadorviewmodel.components.CustomFloatingActionButton
import edu.utvt.contadorviewmodel.viewmodels.CountViewModel

@Composable
fun CountView(viewModel: CountViewModel) {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CurrentValueCounter(viewModel.count.value)
        CustomFloatingActionButton(contentDescription = "Incrementar Contador", onClick = {viewModel.increment()})
    }
}