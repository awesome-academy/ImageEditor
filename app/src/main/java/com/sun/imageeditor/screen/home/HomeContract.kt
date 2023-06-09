package com.sun.imageeditor.screen.home

import android.os.Bundle
import com.sun.imageeditor.data.model.Photo
import com.sun.imageeditor.data.model.PhotoCollection

class HomeContract {
    interface View {
        fun onGetPhotoCollectionsSuccess(collections: MutableList<PhotoCollection>)
        fun onGetPhotosSuccess(photos: MutableList<Photo>)
        fun showPhoto(url: String?)
        fun startNewActivity(activityClass: Class<*>, bundle: Bundle? = null)
        fun onError(msg: String?)
    }

    interface Presenter {
        fun getPhotoCollections()
        fun getPhotos()
        fun setView(view: View)
    }
}
