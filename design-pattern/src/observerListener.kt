import kotlin.properties.Delegates

interface TextChangedListener {
    fun onTextChanged(newText: String)
}

class PrintingTextChangedListener: TextChangedListener {
    override fun onTextChanged(newText: String) = println("This is changed to $newText")
}

class TextView {

    var listener: TextChangedListener? = null

    var text: String by Delegates.observable("") { property, oldValue, newValue ->
        listener?.onTextChanged(newValue)
    }
}