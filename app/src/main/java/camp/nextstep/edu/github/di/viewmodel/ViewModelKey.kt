package camp.nextstep.edu.github.di.viewmodel

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY)
annotation class ViewModelKey(val value: KClass<out ViewModel>)
