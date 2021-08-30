package deck.developer.todolist.db.todo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1, entities = [Todo::class])
abstract class AppDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}
