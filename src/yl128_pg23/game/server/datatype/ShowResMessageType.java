package yl128_pg23.game.server.datatype;

import common.ICRMessageType;
import yl128_pg23.game.server.model.Team;

/**
 * 
 * @author Yiqing Lu
 *
 */

public class ShowResMessageType implements ICRMessageType {

	/**
	 * Compiler generated unique ID
	 */
	private static final long serialVersionUID = -1910338096932711898L;
	Team team;

	public ShowResMessageType(Team team) {
		this.team = team;
	}

	public Team getTeam() {
		return this.team;
	}
}