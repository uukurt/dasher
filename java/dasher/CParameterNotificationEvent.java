/*
  This file is part of JDasher.

  JDasher is free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.

  JDasher is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with JDasher; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

  Copyright (C) 2006      Christopher Smowton <cs448@cam.ac.uk>

  JDasher is a port derived from the Dasher project; for information on
  the project see www.dasher.org.uk; for information on JDasher itself
  and related projects see www.smowton.net/chris

*/

package dasher;

/**
 * Event notifying components that a given parameter's value
 * has changed, and so dependent components should reload
 * its value.
 */
public class CParameterNotificationEvent extends CEvent {
	
	/**
	 * Creates a new ParameterNotificationEvent
	 * 
	 * @param iParameter Parameter which has changed
	 */
	public CParameterNotificationEvent(EParameters iParameter) {
	    m_iEventType = 1; // EV_PARAM_NOTIFY
	    m_iParameter = iParameter;
	}

	/**
	 * Changed parameter
	 */
	public EParameters m_iParameter;
	
}
