package com.rodvar.kotlinbase.feature.bottomnavigation

import com.rodvar.kotlinbase.R
import com.rodvar.kotlinbase.base.presentation.BaseFragment
import kotlinx.android.synthetic.main.fragment_bottomnavigation_main.*

/**
 * Created by rodvar on 5/9/17.
 */
class MainBottomNavigationFragment : BaseFragment() {
    override fun getLayoutResId(): Int {
        return R.layout.fragment_bottomnavigation_main
    }

    companion object {
        fun newInstance(): CameraViewFragment = CameraViewFragment()
    }

    fun defaultMenuOption() {
        this.bottom_navigation.selectedItemId = R.id.menu_item_accounts
    }

}