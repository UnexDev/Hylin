package skytils.kopixel.guild

import com.google.gson.JsonObject
import skytils.kopixel.extension.converter.byBoolean
import skytils.kopixel.extension.converter.byDate
import skytils.kopixel.extension.converter.byInt
import skytils.kopixel.extension.converter.byString

class GuildRank(json: JsonObject) {
    val name by json.byString()
    val default by json.byBoolean()
    val tag by json.byString()
    val created by json.byDate()
    val priority by json.byInt()

    override fun toString(): String {
        return "GuildRank(name='$name', default=$default, tag='$tag', created=$created, priority=$priority)"
    }
}
