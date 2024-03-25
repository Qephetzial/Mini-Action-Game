package com.beta.miniactiongame.factory;

import com.beta.miniactiongame.model.item.AOEDamage;
import com.beta.miniactiongame.model.item.CastTime;
import com.beta.miniactiongame.model.item.DamageType;
import com.beta.miniactiongame.model.item.Spell;
import com.beta.miniactiongame.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SpellFactory {

    private final ItemService itemService;

    public Spell createBaseSpell(int damage, int numberOfTarget, DamageType damageType) {
        Spell spell = itemService.getSpellByName(STR."Base spell-\{damageType}/\{damage}");
        if (spell == null) {
            spell = new Spell();
            spell.setName(STR."Base spell-\{damageType}/\{damage}");
            spell.setDamage(damage);
            spell.setTarget(numberOfTarget);
            spell.setDamageType(damageType);
            spell.setAoeDamage(AOEDamage.NONE);
            spell.setCastTime(CastTime.ON_ATTACK);
            itemService.saveSpell(spell);
        }
        return spell;
    }

    public Spell smallExplosiveSpell(int damage, int numberOfTarget, DamageType damageType) {
        Spell spell = itemService.getSpellByName(STR."Small inline spell-\{damageType}/\{damage}");
        if (spell == null) {
            spell = new Spell();
            spell.setName(STR."Small inline spell-\{damageType}/\{damage}");
            spell.setDamage(damage);
            spell.setTarget(numberOfTarget);
            spell.setDamageType(damageType);
            spell.setAoeDamage(AOEDamage.SMALL_CIRCLE);
            spell.setCastTime(CastTime.ON_ATTACK);
            itemService.saveSpell(spell);
        }
        return spell;
    }

    public Spell largeExplosiveSpell(int damage, int numberOfTarget, DamageType damageType) {
        Spell spell = itemService.getSpellByName(STR."Large inline spell-\{damageType}/\{damage}");
        if (spell == null) {
            spell = new Spell();
            spell.setName(STR."Large inline spell-\{damageType}/\{damage}");
            spell.setDamage(damage);
            spell.setTarget(numberOfTarget);
            spell.setDamageType(damageType);
            spell.setAoeDamage(AOEDamage.LARGE_CIRCLE);
            spell.setCastTime(CastTime.ON_ATTACK);
            itemService.saveSpell(spell);
        }
        return spell;
    }

    public Spell smallConeSpell(int damage, int numberOfTarget, DamageType damageType) {
        Spell spell = itemService.getSpellByName(STR."Small cone spell-\{damageType}/\{damage}");
        if (spell == null) {
            spell = new Spell();
            spell.setName(STR."Small cone spell-\{damageType}/\{damage}");
            spell.setDamage(damage);
            spell.setTarget(numberOfTarget);
            spell.setDamageType(damageType);
            spell.setAoeDamage(AOEDamage.SMALL_CONE);
            spell.setCastTime(CastTime.ON_ATTACK);
            itemService.saveSpell(spell);
        }
        return spell;
    }

    public Spell largeConeSpell(int damage, int numberOfTarget, DamageType damageType) {
        Spell spell = itemService.getSpellByName(STR."Large cone spell-\{damageType}/\{damage}");
        if (spell == null) {
            spell = new Spell();
            spell.setName(STR."Large cone spell-\{damageType}/\{damage}");
            spell.setDamage(damage);
            spell.setTarget(numberOfTarget);
            spell.setDamageType(damageType);
            spell.setAoeDamage(AOEDamage.LARGE_CONE);
            spell.setCastTime(CastTime.ON_ATTACK);
            itemService.saveSpell(spell);
        }
        return spell;
    }

    public Spell smallChainSpell(int damage, int numberOfTarget, DamageType damageType) {
        Spell spell = itemService.getSpellByName(STR."Small chain spell-\{damageType}/\{damage}");
        if (spell == null) {
            spell = new Spell();
            spell.setName(STR."Small chain spell-\{damageType}/\{damage}");
            spell.setDamage(damage);
            spell.setTarget(numberOfTarget);
            spell.setDamageType(damageType);
            spell.setAoeDamage(AOEDamage.SMALL_CHAIN);
            spell.setCastTime(CastTime.ON_ATTACK);
            itemService.saveSpell(spell);
        }
        return spell;
    }

    public Spell largeChainSpell(int damage, int numberOfTarget, DamageType damageType) {
        Spell spell = itemService.getSpellByName(STR."Large chain spell-\{damageType}/\{damage}");
        if (spell == null) {
            spell = new Spell();
            spell.setName(STR."Large chain spell-\{damageType}/\{damage}");
            spell.setDamage(damage);
            spell.setTarget(numberOfTarget);
            spell.setDamageType(damageType);
            spell.setAoeDamage(AOEDamage.LARGE_CHAIN);
            spell.setCastTime(CastTime.ON_ATTACK);
            itemService.saveSpell(spell);
        }
        return spell;
    }

    public Spell smallInlineSpell(int damage, int numberOfTarget, DamageType damageType) {
        Spell spell = itemService.getSpellByName(STR."Small inline spell-\{damageType}/\{damage}");
        if (spell == null) {
            spell = new Spell();
            spell.setName(STR."Small inline spell-\{damageType}/\{damage}");
            spell.setDamage(damage);
            spell.setTarget(numberOfTarget);
            spell.setDamageType(damageType);
            spell.setAoeDamage(AOEDamage.SMALL_INLINE);
            spell.setCastTime(CastTime.ON_ATTACK);
            itemService.saveSpell(spell);
        }
        return spell;
    }

    public Spell largeInlineSpell(int damage, int numberOfTarget, DamageType damageType) {
        Spell spell = itemService.getSpellByName(STR."Large inline spell-\{damageType}/\{damage}");
        if (spell == null) {
            spell = new Spell();
            spell.setName(STR."Large inline spell-\{damageType}/\{damage}");
            spell.setDamage(damage);
            spell.setTarget(numberOfTarget);
            spell.setDamageType(damageType);
            spell.setAoeDamage(AOEDamage.LARGE_INLINE);
            spell.setCastTime(CastTime.ON_ATTACK);
            itemService.saveSpell(spell);
        }
        return spell;
    }

}
