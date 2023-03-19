package nitro.network.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import nitro.network.R
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView


@BindingAdapter("image")
fun loadImage(view: ImageView, url: String?) {
    Glide.with(view)
        .load(url)
        .error(R.drawable.splash)
        .load(url).into(view)
}

@BindingAdapter("circleImage")
fun loadCircleImage(view: CircleImageView, url: String?) {
    Glide.with(view).load(url).into(view)
}