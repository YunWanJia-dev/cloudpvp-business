package me.ywj.cloudpvp.core.utils

import me.ywj.cloudpvp.core.constant.steam.SteamUser
import me.ywj.cloudpvp.core.type.SteamId64

/**
 * PlayerUtils
 * 玩家工具类
 * @author sheip9
 * @since 2024/10/19 00:24
 */
object PlayerUtils {
    /**
     * checkIdIsValid
     * 校验玩家steamId64有效性
     * @param steamId64 lobbyId
     * @return id是否有校
     */
    fun checkIdIsValid(steamId64 : SteamId64?): Boolean {
        return steamId64 != null && steamId64 > SteamUser.MINIMAL_ID
    }
}