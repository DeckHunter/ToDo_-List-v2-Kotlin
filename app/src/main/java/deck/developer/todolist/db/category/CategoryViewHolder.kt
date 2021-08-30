package deck.developer.todolist.db.category

import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import deck.developer.todolist.R

class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val radioButton: RadioButton = view.findViewById(R.id.elementRadio)
}
