/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.jpa;

import java.util.Map;
import java.util.Set;

import org.hibernate.jpa.internal.HintsCollector;

import javax.persistence.LockModeType;

/**
 * Combined set of Hibernate and Jakarta Persistence hints
 *
 * @see javax.persistence.EntityManager#setProperty(String, Object)
 * @see javax.persistence.EntityManager#find(Class, Object, Map)
 * @see javax.persistence.EntityManager#find(Class, Object, LockModeType, Map)
 * @see javax.persistence.EntityManager#lock(Object, LockModeType, Map)
 * @see javax.persistence.Query#setHint
 *
 * @author Steve Ebersole
 */
public interface AvailableHints extends HibernateHints, SpecHints {
	static Set<String> getDefinedHints() {
		return HintsCollector.getDefinedHints();
	}
}
