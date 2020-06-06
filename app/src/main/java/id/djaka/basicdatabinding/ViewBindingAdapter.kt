package id.djaka.basicdatabinding

import android.view.View
import androidx.databinding.BindingAdapter

/**
 * Created by Djaka Pradana on 05/06/20.
 */

object ViewBindingAdapter {
    @BindingAdapter("visibilityGone")
    @JvmStatic
    fun visibilityGone(view: View, isShouldGone: Boolean) {
        if (isShouldGone) {
            view.visibility = View.GONE
        } else {
            view.visibility = View.VISIBLE
        }
    }
}