package com.sun.imageeditor.data.model

data class Photo(
    val id: String,
    val description: String?,
    val altDescription: String?,
    val photoThumbUrl: String,
    val photoFullUrl: String,
)

object PhotoEntry {
    const val PHOTO = "PHOTO"
    const val SEARCH_PHOTO = "SEARCH_PHOTO"
    const val ID = "id"
    const val DESCRIPTION = "description"
    const val ALT_DESCRIPTION = "alt_description"

    const val URLS = "urls"
    const val THUMB = "thumb"
    const val FULL = "full"
}
