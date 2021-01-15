package cl.eme.restapidesafiodos

import android.util.Log

class PhotoRepository {


    val database=PhotoApplication.photoDatabase!!
    val photoList= database.photoDao().getPhotos()

    suspend fun getPhotosfromApi(){

        val response=RetrofitClient.retrofitClient().getPhotos()

        when(response.isSuccessful){

            true -> {
                response.body()?.let {
                    database.photoDao().insertPhotos(it)
                    Log.d("Repo-getphotos", "getPhotosfromApi con :${it.size} fotos ")
                }

            }

            false -> {
                Log.d("Repo-getphotos", "getPhotosfromApi: ${response.errorBody()}")

            }
        }

    }

}