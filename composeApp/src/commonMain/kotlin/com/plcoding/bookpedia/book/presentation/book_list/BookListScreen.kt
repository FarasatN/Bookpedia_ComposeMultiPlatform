package com.plcoding.bookpedia.book.presentation.book_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar
import com.plcoding.bookpedia.core.presentation.DarkBlue
import org.koin.compose.viewmodel.koinViewModel



@Composable
fun BookListScreenRoot(
    modifier: Modifier = Modifier,
    viewModel: BookListViewModel = koinViewModel(),
    onBookClick: (Book) -> Unit
){
    val state by viewModel.state.collectAsStateWithLifecycle()
    BookListScreen(
        state = state,
        onAction = {action ->
            when(action){
                is BookListAction.OnBookClick -> onBookClick(action.book)
                else -> Unit
            }
            viewModel.onAction(action)
        },
        onBookClick = onBookClick,
        modifier = modifier,
    )

}

@Composable
private fun BookListScreen(
    state: BookListState,
    onAction: (BookListAction) -> Unit,
    onBookClick: (Book) -> Unit,
    modifier: Modifier = Modifier,

    viewModel: BookListViewModel = koinViewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkBlue)
            .statusBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BookSearchBar(
            searchQuery = state.searchQuery,
            onSearchQueryChange = { query ->
                onAction(BookListAction.OnSearchQueryChange(query))
            },
            onImeSearch = {
                keyboardContr
            }
        )
    }
}