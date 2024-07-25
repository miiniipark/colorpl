package com.presentation.util

import android.content.Context
import com.colorpl.presentation.R

enum class Mode(val mode: String) {
    WALK("WALK"),
    BUS("BUS"),
    SUBWAY("SUBWAY"),
    EXPRESS_BUS("EXPRESS BUS"),
    TRAIN("TRAIN"),
    AIRPLANE("AIRPLANE"),
    FERRY("FERRY"),
}

enum class TicketState(val state: Int){
    ISSUED(0),
    UNISSUED(1)
}
enum class Calendar{
    CURRENT,
    NEXT,
    PREVIOUS,
    CHANGE,
    RESTORE
}

enum class FilterType(private val resourceId: Int) {
    ALL(R.string.feed_filter_all),
    MOVIE(R.string.feed_filter_movie),
    PERFORMANCE(R.string.feed_filter_performance),
    CONCERT(R.string.feed_filter_concert),
    PLAY(R.string.feed_filter_play),
    MUSICAL(R.string.feed_filter_musical),
    EXHIBITION(R.string.feed_filter_exhibition);

    fun getText(context: Context): String {
        return context.getString(resourceId)
    }
}

enum class Sign{
    ID,
    PASSWORD,
    NICKNAME,
    PROFILE
}

enum class Category{
    MOVIE,
    THEATRE,
    MUSICAL,
    CIRCUS,
    EXHIBITION
}

enum class PaymentResult{
    COMPLETE,
    REFUND,
    USE
}