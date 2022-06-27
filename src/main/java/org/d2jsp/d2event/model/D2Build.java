package org.d2jsp.d2event.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum D2Build {

    PHYS_MELEE_AMA("phys melee ama"),
    PSN_JAVA("psn java"),
    COLD_FIRE_BOWA("cold/fire bowa"),
    PHYS_BOWA("phys bowa"),
    KICKSIN("kicksin"),
    BLADEFURY_ASSA("bladefury assa"),
    FIRE_TRAP_ASSA("fire trap assa"),
    WARCRY_BARB("warcry barb"),
    WW_BARB("ww barb"),
    BERSERK_BARB("berserk barb"),
    THROW_BARB("throw barb"),
    SUMMONER_DRUID("summoner druid"),
    WEREWOLF_DRUID("werewolf druid"),
    WEREBEAR_DRUID("werebear druid"),
    MOLTEN_BOULDER_DRUID("molten boulder druid"),
    GOLEM_PSN_DAGGER_CE_NEC("golem psn dagger CE nec"),
    BONESPEAR_NEC("bonespear nec"), // no curses, no summons, no bone armor, no CE
    SUMMONER_NEC("summoner nec"), // no bone spells,
    COLD_SORC("cold sorc"), // no blizzard, no frozenorb
    LIGHT_SORC("light sorc"), // no nova, no lightning, no chainlightning
    FIRE_SORC("fire sorc"), // no fireball, no meteor, no hydra
    VENGENCE_PALA("vengence pala"),
    ZEALER("zealer"),
    SMITER("smiter");

    @Getter
    private final String name;

    @Override
    public String toString() {
        return name;
    }
}
