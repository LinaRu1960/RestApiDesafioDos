package cl.eme.restapidesafiodos

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class PhotosVM: ViewModel() {

    val repository=PhotoRepository()
    val photoList=repository.photoList

    init{

        viewModelScope.launch{
            repository.getPhotosfromApi()
        }
    }

}