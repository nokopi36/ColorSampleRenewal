package com.nokopi.newcolorsample.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.nokopi.newcolorsample.R
import com.nokopi.newcolorsample.ui.theme.ExtendedTheme

/**
 * TODO: ConfluenceのURLやFigmaのURL等を貼ってください
 */
@Composable
fun EquipmentButton(
    onClick: () -> Unit,
    painter: Int,
    text: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = CutCornerShape(percent = 5)
    ) {
        Image(
            painter = painterResource(id = painter),
            contentDescription = null,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = text,
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center,
        )
    }
}

@Preview
@Composable
private fun EquipmentButtonPreview() {
    ExtendedTheme {
        EquipmentButton(
            onClick = {},
            painter = R.drawable.doraemon,
            text = "ドラえもん"
        )
    }
}