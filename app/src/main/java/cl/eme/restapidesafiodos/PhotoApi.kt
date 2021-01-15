package cl.eme.restapidesafiodos

import android.provider.ContactsContract
import retrofit2.Response
import retrofit2.http.GET

interface PhotoApi {
    @GET("photos")
    suspend fun getPhotos(): Response<List<ContactsContract.Contacts.Photo>>
}