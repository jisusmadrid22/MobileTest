package com.yzdev.mobiletest.data.repository

/** Clase para controlar los diferentes estados de la interfaz con respecto a las consultas */

sealed class UiStatus<Type>(val get: Type?, val message: String?){

    class Success<Type>(private val data: Type): UiStatus<Type>(data, null)

    class Failure<Type>(private val msg: String): UiStatus<Type>(null, msg)

    class Loading<Type>: UiStatus<Type>(null, null)

    class Default<Type>: UiStatus<Type>(null, null)

}
