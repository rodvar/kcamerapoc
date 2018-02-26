package com.rodvar.kotlinbase.feature.bottomnavigation

import com.rodvar.kotlinbase.base.presentation.BasePresenter

/**
 * Created by rodvar on 5/9/17.
 */
class CameraViewPresenter : BasePresenter() {

    override fun onViewCreated() {
    }


    override fun onResume() {
        super.onResume()
        (this.view as CameraViewFragment).startCamera()
    }

    override fun onPause() {
        (this.view as CameraViewFragment).stopCamera()
        super.onPause()
    }

}