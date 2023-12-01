package edu.utvt.contador.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import edu.utvt.contador.components.ChangeCounter
import edu.utvt.contador.components.CurrentValueCounter

@Composable
fun CountView(){
    var counter by remember {
        mutableStateOf(0)
    }

    Column (
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        CurrentValueCounter(counter = counter)
        ChangeCounter(counter = counter ) {
            counter = it + 1
        }
    }
}