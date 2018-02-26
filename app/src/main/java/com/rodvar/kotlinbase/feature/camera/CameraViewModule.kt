package com.rodvar.kotlinbase.feature.camera

import com.rodvar.kotlinbase.base.presentation.AppPresenter
import com.rodvar.kotlinbase.base.presentation.BaseFragment
import com.rodvar.kotlinbase.base.presentation.BaseModule
import com.rodvar.kotlinbase.di.scopes.PerFeature
import com.rodvar.kotlinbase.feature.bottomnavigation.CameraViewFragment
import com.rodvar.kotlinbase.feature.bottomnavigation.CameraViewPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by rodvar on 30/8/17.
 */
@Module(includes = arrayOf(BaseModule::class))
class CameraViewModule {

    @PerFeature
    @Provides
    fun view(): BaseFragment = CameraViewFragment.newInstance()

    @PerFeature
    @Provides
    fun presenter(): AppPresenter = CameraViewPresenter()
}