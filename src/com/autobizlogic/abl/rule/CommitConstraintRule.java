package com.autobizlogic.abl.rule;

/**
 * Define and execute a commit constraint rule. This is just like a regular constraint,
 * except that it only gets executed once, right before commit.
 */
public class CommitConstraintRule extends ConstraintRule {

	protected CommitConstraintRule(LogicGroup logicGroup, String logicMethodName) {
		super(logicGroup, logicMethodName);
	}

	@SuppressWarnings("unused")
	private final static String SVN_ID = "$Id: Version 2.1.5 Build 0602 Date 2012-04-28-14-13  CommitConstraintRule.java 98 2011-12-14 17:48:18Z max@automatedbusinesslogic.com $";
}

/*
 * The contents of this file are subject to the Automated Business Logic Public License Version 1.0 (the "License"),
 * which is derived from the Mozilla Public License version 1.1. You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at http://www.automatedbusinesslogic.com/license/public-license
 *
 * Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND, 
 * either express or implied. See the License for the specific language governing rights and limitations under the License.
 */
 