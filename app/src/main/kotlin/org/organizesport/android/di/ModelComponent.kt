package org.organizesport.android.di

import android.content.Context
import dagger.Component
import dagger.android.AndroidInjectionModule
import org.organizesport.android.BaseApplication
import org.organizesport.android.interactor.LoginActivityInteractor
import org.organizesport.android.interactor.RssFeedActivityInteractor
import org.organizesport.android.interactor.SportsListActivityInteractor
import javax.inject.Singleton

/**
 * This interface is used to connect objects to their dependencies, typically by use of overridden
 * {@link Inject} methods.
 *
 * This interface is annotated with the Dagger {@link Component} annotation, which takes a list of
 * modules as an input. In this case, {@link ModelModule} has been added to the list.
 *
 * @author pablol.
 * @since 1.0
 */
@Singleton
@Component(modules = arrayOf(ModelModule::class))
interface ModelComponent {
    fun provideContext(): Context
    fun injectDependency(loginInteractor: LoginActivityInteractor)
    fun injectDependency(sportsListInteractor: SportsListActivityInteractor)
    fun injectDependency(rssfeedInteractor: RssFeedActivityInteractor)
}
