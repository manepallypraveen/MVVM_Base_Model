package nitro.network.utils
//
//import androidx.room.TypeConverter
//import com.google.gson.Gson
//import com.google.gson.reflect.TypeToken
//
//class DataConverters {
//    @TypeConverter
//    fun toPostImageList(json: String?): List<PostImage> {
//        if(json.isNullOrBlank()) return emptyList()
//        val type = object : TypeToken<List<PostImage>>() {}.type
//        return Gson().fromJson(json, type)
//    }
//
//    @TypeConverter
//    fun toPostImageString(list: List<PostImage>?): String {
//        val type = object : TypeToken<List<PostImage>>() {}.type
//        return Gson().toJson(list, type)
//    }
//
//    @TypeConverter
//    fun toPostVideoList(json: String?): List<PostVideo> {
//        if(json.isNullOrBlank()) return emptyList()
//        val type = object : TypeToken<List<PostVideo>>() {}.type
//        return Gson().fromJson(json, type)
//    }
//
//    @TypeConverter
//    fun toPostVideoString(list: List<PostVideo>?): String {
//        val type = object : TypeToken<List<PostVideo>>() {}.type
//        return Gson().toJson(list, type)
//    }
//
//    @TypeConverter
//    fun toPostHeartList(json: String?): List<Heart> {
//        if(json.isNullOrBlank()) return emptyList()
//        val type = object : TypeToken<List<Heart>>() {}.type
//        return Gson().fromJson(json, type)
//    }
//
//    @TypeConverter
//    fun toPostHeartString(list: List<Heart>?): String {
//        val type = object : TypeToken<List<Heart>>() {}.type
//        return Gson().toJson(list, type)
//    }
//
//    @TypeConverter
//    fun toCommentList(json: String?): List<Comment> {
//        if(json.isNullOrBlank()) return emptyList()
//        val type = object : TypeToken<List<Comment>>() {}.type
//        return Gson().fromJson(json, type)
//    }
//
//    @TypeConverter
//    fun toPostCommentString(list: List<Comment>?): String {
//        val type = object : TypeToken<List<Comment>>() {}.type
//        return Gson().toJson(list, type)
//    }
//
//    @TypeConverter
//    fun toList(json: String?): List<String> {
//        if(json.isNullOrBlank()) return emptyList()
//        val type = object : TypeToken<List<String>>() {}.type
//        return Gson().fromJson(json, type)
//    }
//
//    @TypeConverter
//    fun toUserGoalString(userGoalModel: UserGoalModel?): String {
//        val type = object : TypeToken<UserGoalModel>() {}.type
//        return Gson().toJson(userGoalModel, type)
//    }
//
//    @TypeConverter
//    fun toUserGoal(json: String?): UserGoalModel? {
//        if(json.isNullOrBlank()) return null
//        val type = object : TypeToken<UserGoalModel>() {}.type
//        return Gson().fromJson(json, type)
//    }
//
//    @TypeConverter
//    fun toString(list: List<String>?): String {
//        val type = object : TypeToken<List<String>>() {}.type
//        return Gson().toJson(list, type)
//    }
//
//    @TypeConverter
//    fun toGoalItemList(json: String?): List<GoalItem>? {
//        if(json.isNullOrBlank()) return emptyList()
//        val type = object : TypeToken<List<GoalItem>>() {}.type
//        return Gson().fromJson(json, type)
//    }
//
//    @TypeConverter
//    fun toGoalItemString(list: List<GoalItem>?): String {
//        val type = object : TypeToken<List<GoalItem>>() {}.type
//        return Gson().toJson(list, type)
//    }
//
//    @TypeConverter
//    fun toInterestItemList(json: String?): List<InterestItem>? {
//        if(json.isNullOrBlank()) return emptyList()
//        val type = object : TypeToken<List<InterestItem>>() {}.type
//        return Gson().fromJson(json, type)
//    }
//
//    @TypeConverter
//    fun toInterestItemString(list: List<InterestItem>?): String {
//        val type = object : TypeToken<List<InterestItem>>() {}.type
//        return Gson().toJson(list, type)
//    }
//
//    @TypeConverter
//    fun toAddressList(json: String?): List<Address>? {
//        if(json.isNullOrBlank()) return emptyList()
//        val type = object : TypeToken<List<Address>>() {}.type
//        return Gson().fromJson(json, type)
//    }
//
//    @TypeConverter
//    fun toAddressString(list: List<Address>?): String {
//        val type = object : TypeToken<List<Address>>() {}.type
//        return Gson().toJson(list, type)
//    }
//
//    @TypeConverter
//    fun toEventSpeakerList(json: String?): List<EventSpeaker> {
//        if(json.isNullOrBlank()) return emptyList()
//        val type = object : TypeToken<List<EventSpeaker>>() {}.type
//        return Gson().fromJson(json, type)
//    }
//
//    @TypeConverter
//    fun toEventSpeakerString(list: List<EventSpeaker>?): String {
//        val type = object : TypeToken<List<EventSpeaker>>() {}.type
//        return Gson().toJson(list, type)
//    }
//
//    @TypeConverter
//    fun toEventHostList(json: String?): List<EventHost> {
//        if(json.isNullOrBlank()) return emptyList()
//        val type = object : TypeToken<List<EventHost>>() {}.type
//        return Gson().fromJson(json, type)
//    }
//
//    @TypeConverter
//    fun toEventHostString(list: List<EventHost>?): String {
//        val type = object : TypeToken<List<EventHost>>() {}.type
//        return Gson().toJson(list, type)
//    }
//
//    @TypeConverter
//    fun toEventImageList(json: String?): List<EventImage> {
//        if(json.isNullOrBlank()) return emptyList()
//        val type = object : TypeToken<List<EventImage>>() {}.type
//        return Gson().fromJson(json, type)
//    }
//
//    @TypeConverter
//    fun toEventImageString(list: List<EventImage>?): String {
//        val type = object : TypeToken<List<EventImage>>() {}.type
//        return Gson().toJson(list, type)
//    }
//
//    @TypeConverter
//    fun toEventVideoList(json: String?): List<EventVideo> {
//        if(json.isNullOrBlank()) return emptyList()
//        val type = object : TypeToken<List<EventVideo>>() {}.type
//        return Gson().fromJson(json, type)
//    }
//
//    @TypeConverter
//    fun toEventVideoString(list: List<EventVideo>?): String {
//        val type = object : TypeToken<List<EventVideo>>() {}.type
//        return Gson().toJson(list, type)
//    }
//}
