/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.metamodel;

import org.hibernate.Incubating;

import javax.persistence.metamodel.Attribute.PersistentAttributeType;

/**
 * An extended set of {@link PersistentAttributeType} adding {@link #ANY}
 *
 * @since 6.0
 *
 */
@Incubating
public enum AttributeClassification {
	/**
	 * @see javax.persistence.Basic
	 */
	BASIC( PersistentAttributeType.BASIC ),

	/**
	 * @see javax.persistence.Embedded
	 */

	EMBEDDED( PersistentAttributeType.EMBEDDED ),

	/**
	 * @see org.hibernate.annotations.Any
	 */
	ANY( null ),

	/**
	 * @see javax.persistence.OneToOne
	 */
	ONE_TO_ONE( PersistentAttributeType.ONE_TO_ONE ),

	/**
	 * @see javax.persistence.ManyToOne
	 */
	MANY_TO_ONE( PersistentAttributeType.MANY_TO_ONE ),

	/**
	 * @see javax.persistence.ElementCollection
	 */
	ELEMENT_COLLECTION( PersistentAttributeType.ELEMENT_COLLECTION ),

	/**
	 * @see javax.persistence.OneToMany
	 */
	ONE_TO_MANY( PersistentAttributeType.ONE_TO_MANY ),

	/**
	 * @see javax.persistence.ManyToMany
	 */
	MANY_TO_MANY( PersistentAttributeType.MANY_TO_MANY );

	private final PersistentAttributeType jpaClassification;

	AttributeClassification(PersistentAttributeType jpaClassification) {
		this.jpaClassification = jpaClassification;
	}

	/**
	 * The associated {@link PersistentAttributeType}, if one
	 */
	public PersistentAttributeType getJpaClassification() {
		return jpaClassification;
	}
}
