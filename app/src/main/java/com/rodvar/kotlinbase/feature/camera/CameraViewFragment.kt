package com.rodvar.kotlinbase.feature.bottomnavigation

import com.rodvar.kotlinbase.R
import com.rodvar.kotlinbase.base.presentation.BaseFragment
import com.wonderkiln.camerakit.CameraKit
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

    fun invertCamera() {
        when (cameraView.facing) {
            CameraKit.Constants.FACING_BACK -> cameraView.facing = CameraKit.Constants.FACING_FRONT
            CameraKit.Constants.FACING_FRONT -> cameraView.facing = CameraKit.Constants.FACING_BACK
        }
        this.refresh()
    }

    private fun refresh() {
        when (cameraView.facing) {
            CameraKit.Constants.FACING_BACK -> invertButton.text = resources.getString(R.string.front_camera)
            CameraKit.Constants.FACING_FRONT -> invertButton.text = resources.getString(R.string.back_camera) // TODO fetch this once!
        }
    }


}