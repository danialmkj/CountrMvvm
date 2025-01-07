package edu.danialmkj.countrmvvm

//Our Counter Model
data class CounterModel(var count: Int)

//Our Counter Repository
class CounterRepository {
    private val _count = CounterModel(0)

    fun getCount() = _count

    fun increment() {
        _count.count++
    }

    fun decrement() {
        _count.count--
    }


}