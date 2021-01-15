package cl.eme.restapidesafiodos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
[X] 1. Ir a la web de jsonplaceholder https://jsonplaceholder.typicode.com, e identificar el método a
        utilizar para los datos de imagenes.
[X] 2. Crear un nuevo proyecto kotlin, min sdk 21, targetSdk 29, blank activity, llamado RestApiDesafioDos.
[X] 3. Agregar las dependecias en el archivo gradle.
[X] 4. Modificar diseño layout por defecto activity_main.xml para incluir una vista tipo RecyclerView.
[X] 5. Crear el layout photos_list_item.xml con los atributos image y title.
[X] 6. Crear el archivo pojo “Photo” con los atributos id, title, url y thumbnail.
[X] 7. Crear la interfaz Api con el método GET de la lista de fotos del api.
[X] 8. Crear la clase cliente de Retrofit.
[] 9. Crear la clase PhotoAdapter con la implementación de ViewHolder y parametrización de los
        datos image y title, utilizando Picasso para la carga de la imagen en la vista imageView por cada
        elemento de la lista. y asignando el valor true al método Picasso setIndicators debuggear la
        carga de imágenes. Se empleara metodo Coil para la carga de imagenes
[] 10. Modificar la clase de Actividad agregando un nuevo método loadApiData() e instanciando la clase
        Recyclerview y PhotoAdapter.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}