package nitro.network.utils

interface SendDataListener {
    fun sendData(mediaString: String?)
    fun sendData(checkedId: Int)
}