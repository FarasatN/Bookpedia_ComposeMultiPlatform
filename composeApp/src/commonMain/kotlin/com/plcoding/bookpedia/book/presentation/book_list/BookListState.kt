package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "linux",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val selectedTabIndex: Int = 0,
    val isLoading: Boolean = false,
    val errorMessage: UiText? = null,
)
