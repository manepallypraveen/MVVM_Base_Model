package com.rideplus.partner.ui.adapters
//
//import android.annotation.SuppressLint
//import android.content.Context
//import android.graphics.drawable.BitmapDrawable
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.PopupWindow
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import nitro.network.R
//import com.bumptech.glide.Glide
//import java.text.SimpleDateFormat
//
//class SensorsListAdapter(
//    var list: List<SensorDevice>,
//    var itemSelectionListener: ItemSelectionListener,
//    var context: Context
//) :
//    RecyclerView.Adapter<SensorsListAdapter.CheckHolder>() {
//
//    var binding: ItemSensorsListBinding? = null
//
//    interface ItemSelectionListener {
//        fun onItemClick(position: Int, list: SensorDevice,analytics:String)
//        fun onItemClickEdit(position: Int, list: SensorDevice)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CheckHolder {
//        binding = ItemSensorsListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return CheckHolder(binding!!)
//    }
//
//    override fun getItemCount(): Int {
//        return list.size
//    }
//
//    override fun onBindViewHolder(holder: CheckHolder, position: Int) {
//        holder.setData(list[position])
//    }
//
//
//    inner class CheckHolder(var itemBinding: ItemSensorsListBinding) :
//        RecyclerView.ViewHolder(itemBinding.root) {
//
//        @SuppressLint("SetTextI18n")
//        fun setData(model: SensorDevice) {
//
//            itemBinding.txtSensorName.text = model.sensorName
//
//            Glide.with(context)
//                .load(model.sensorImage)
//                .into(itemBinding.imgSensor)
//
//            itemBinding.btnAnalytics.setOnClickListener {
//                itemSelectionListener.onItemClick(position, model,model.sensorName)
//                notifyDataSetChanged()
//            }
//
//            itemBinding.imgSensor.setOnClickListener {
//                itemSelectionListener.onItemClick(position, model,model.sensorName)
//                notifyDataSetChanged()
//            }
//
//            itemBinding.txtAppInfo.setOnClickListener {
//                notifyDataSetChanged()
//                showPopup(itemBinding.txtAppInfo, model.sensorName!!, model.sensorDescription!!)
//            }
//
//            itemBinding.imgEditName.setOnClickListener {
//                itemSelectionListener.onItemClickEdit(position, model)
//                notifyDataSetChanged()
//            }
//
//
//        }
//
//    }
//
//
//    val simpledateformat1 = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss") //2022-11-02T06:58:06.000000Z
//    val simpledateformat = SimpleDateFormat("yyyy-MM-dd HH:mm") //2022-11-02 12:27:00
//    val outputDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm")
//
//
//    private var popupWindow: PopupWindow? = null
//
//    @SuppressLint("InflateParams")
//    private fun showPopup(v: View, title: String, description: String) {
//        val layoutInflater =
//            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//        val popupView: View = layoutInflater.inflate(R.layout.tooltip, null)
//        popupWindow = PopupWindow(
//            popupView, ViewGroup.LayoutParams.WRAP_CONTENT,
//            ViewGroup.LayoutParams.WRAP_CONTENT
//        )
//        popupWindow.also {
//            it?.setBackgroundDrawable(BitmapDrawable())
//            it?.setOutsideTouchable(true)
//            it?.setFocusable(true)
//        }
//        val tvTitle = popupView.findViewById<TextView>(R.id.title)
//        val tvDescription = popupView.findViewById<TextView>(R.id.tvDescription)
//        val closeDialog = popupView.findViewById<ImageView>(R.id.close_dialog)
//
//        tvTitle.text = title
//        tvDescription.text = description
//
//        closeDialog.setOnClickListener {
//            popupWindow?.dismiss()
////            overridePendingTransition(R.anim.fedin, R.anim.fedout)
//        }
//        popupWindow?.showAsDropDown(v, -230, -60)
//    }
//
//}