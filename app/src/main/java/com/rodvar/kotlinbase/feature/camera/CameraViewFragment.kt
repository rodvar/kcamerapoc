package com.rodvar.kotlinbase.feature.bottomnavigation

import com.rodvar.kotlinbase.R
import com.rodvar.kotlinbase.base.presentation.BaseFragment
import kotlinx.android.synthetic.main.fragment_camera.*

/**
 * Created by rodvar on 5/9/17.
 */
class CameraViewFragment : BaseFragment() {
    override fun getLayoutResId(): Int {
        return R.layout.fragment_camera
    }

    companion object {
        fun newInstance(): CameraViewFragment = CameraViewFragment()
    }

    fun startCamera() = cameraView.start()

    fun stopCamera() = cameraView.stop()

}