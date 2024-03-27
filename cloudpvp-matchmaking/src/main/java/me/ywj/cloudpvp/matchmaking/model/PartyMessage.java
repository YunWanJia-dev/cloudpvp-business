package me.ywj.cloudpvp.matchmaking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import me.ywj.cloudpvp.matchmaking.constants.PartyEventEnum;

/**
 * PartyMessage
 *
 * @author sheip9
 * @since 2024/3/27 20:46
 */
@Data
@AllArgsConstructor
public class PartyMessage {
    PartyEventEnum event;
    String playerId;
    String content;

    public static PartyMessage playerJoin(String playerId) {
        return new PartyMessage(PartyEventEnum.PLAYER_JOIN, playerId, null);
    }
    public static PartyMessage playerQuit(String playerId) {
        return new PartyMessage(PartyEventEnum.PLAYER_QUIT, playerId, null);
    }
}
