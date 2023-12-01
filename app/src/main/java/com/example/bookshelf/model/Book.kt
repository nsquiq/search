package com.example.bookshelf.model

import kotlinx.serialization.Serializable

@Serializable
data class Book(
    val id: String,
    val description: String,
    val volumeInfo: VolumeInfo,

    ) {


}

@Serializable
data class VolumeInfo(
    val title: String,
    val subtitle: String,
    val description: String,
    val imageLinks: ImageLinks? = null,
    val authors: List<String>,
    val publisher: String,
    val publishedDate: String,
) {

}

@Serializable
data class ImageLinks(
    val smallThumbnail: String,
    val thumbnail: String,
) {
    val httpsThumbnail : String
        get() = thumbnail.replace("http", "https")
}

