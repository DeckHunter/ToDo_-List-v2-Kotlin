package deck.developer.todolist.db.todo

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import deck.developer.todolist.R

class TodoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val textView: TextView = view.findViewById(R.id.elementText)
    val deleteButton: Button = view.findViewById(R.id.deleteButton)
}
