package com.beta.MiniActionGame.communicator;

import com.beta.MiniActionGame.model.entity.Demon;
import com.beta.MiniActionGame.model.entity.Fighter;
import com.beta.MiniActionGame.model.entity.Mage;
import com.beta.MiniActionGame.model.entity.Ranger;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PlayableCharacterCommunicator {
    private Fighter fighter;
    private Ranger ranger;
    private Mage mage;
    private Demon Demon;
}
