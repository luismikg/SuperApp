package com.luis.superapp.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.luis.superapp.R

@Composable
fun AppToolBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            modifier = Modifier.size(45.dp),
            painter = painterResource(id = R.drawable.ic_user),
            contentDescription = "User image"
        )

        Spacer(modifier = Modifier.size(18.dp))

        TextComponent(
            modifier = Modifier.wrapContentSize(),
            textValue = stringResource(R.string.add_address),
            fontSizeValue = 20.sp
        )

        Spacer(modifier = Modifier.weight(1f))

        Icon(
            modifier = Modifier.size(45.dp),
            painter = painterResource(id = R.drawable.ic_notifications),
            contentDescription = "User image"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AppToolBarPreview() {
    AppToolBar()
}