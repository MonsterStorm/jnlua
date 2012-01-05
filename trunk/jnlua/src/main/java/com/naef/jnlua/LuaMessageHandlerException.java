/*
 * $Id$
 * See LICENSE.txt for license terms.
 */

package com.naef.jnlua;

/**
 * Indicates a Lua message handler error.
 * 
 * <p>
 * This exception is thrown if an error occurs running the message handler of a
 * protected call.
 * </p>
 */
public class LuaMessageHandlerException extends LuaException {
	// -- Static
	private static final long serialVersionUID = 1L;

	// -- Construction
	/**
	 * Creates a new instance.
	 * 
	 * @param msg
	 *            the message
	 */
	public LuaMessageHandlerException(String msg) {
		super(msg);
	}

	/**
	 * Creates a new instance.
	 * 
	 * @param msg
	 *            the message
	 * @param cause
	 *            the cause of this exception
	 */
	public LuaMessageHandlerException(String msg, Throwable cause) {
		super(msg, cause);
	}
}