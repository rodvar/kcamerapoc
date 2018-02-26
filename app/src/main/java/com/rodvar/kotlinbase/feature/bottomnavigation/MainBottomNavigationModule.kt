package com.rodvar.kotlinbase.feature.bottomnavigation

import com.rodvar.kotlinbase.base.presentation.AppPresenter
import com.rodvar.kotlinbase.base.presentation.BaseFragment
import com.rodvar.kotlinbase.base.presentation.BaseModule
import com.rodvar.kotlinbase.di.scopes.PerFeature
import dagger.Module
import dagger.Provides

/**
 * Created by rodvar on 30/8/17.
 */
@Module(includes = arrayOf(BaseModule::class))
class MainBottomNavigationModule {

    @PerFeature
    @Provides
    fun view(): BaseFragment = MainBottomNavigationFragment.newInstance()

    @PerFeature
    @Provides
    fun presenter(): AppPresenter = CameraViewPresenter()
}