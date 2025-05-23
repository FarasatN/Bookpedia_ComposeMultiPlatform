package com.plcoding.bookpedia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar


@Preview
@Composable
fun BookSearchBarPreview(background: Boolean = true, backgroundColor: Long = 0xFFFFFFFF) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(backgroundColor))
    )

    BookSearchBar(
            searchQuery = "",
            onSearchQueryChange = {},
            onItemSearch = {},
            modifier = Modifier.fillMaxWidth().background(Color.White))
}