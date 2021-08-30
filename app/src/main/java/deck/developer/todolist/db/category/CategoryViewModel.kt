package deck.developer.todolist.db.category

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CategoryViewModel : ViewModel() {
    private val categories = MutableLiveData<List<Category>>(mutableListOf(
        Category("Todos", 0),
        Category("Entretenimento", 1),
        Category("Compras", 2),
        Category("Tarefa", 3),
    ))
    
    fun getAll(): LiveData<List<Category>> {
        return categories
    }
}
