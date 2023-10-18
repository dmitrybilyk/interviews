Primitives and Objects in Java are passed by Value.
When we create a new object then the new instance with the object state is created in the Heap and
reference value is created in stack.
In case of primitives the copy of values are created and in case of objects the new reference value to the same
object is created. So if you change the object (values of it's fields) in method these changes will be visible
outside the method after it completes execution. But if you assign some new object to the object parameter
reference then original object will not be affected at all.