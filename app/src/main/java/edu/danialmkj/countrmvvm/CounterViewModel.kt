package edu.danialmkj.countrmvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel() {
    //private counter repository
    private val _repository: CounterRepository = CounterRepository()

    //    private val _count = mutableStateOf(0)
    private val _count = mutableStateOf(_repository.getCount().count)

    //expose the count as an immutable state
    val count: MutableState<Int> = _count

    //increment value
    fun increment() {
//        _count.value++
        _repository.increment()
        _count.value = _repository.getCount().count
    }

    //decrement value
    fun decrement() {
//        _count.value--
        _repository.decrement()
        _count.value = _repository.getCount().count
    }


}