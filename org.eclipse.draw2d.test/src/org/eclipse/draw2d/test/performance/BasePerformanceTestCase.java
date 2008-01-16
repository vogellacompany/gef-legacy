/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.draw2d.test.performance;

import org.eclipse.swt.graphics.Font;

import org.eclipse.test.performance.PerformanceTestCase;

public class BasePerformanceTestCase 
	extends PerformanceTestCase
{

protected static final Font TAHOMA = new Font(null, "Tahoma", 8, 0);//$NON-NLS-1$

protected int getWarmupRuns() {
	return 3;
}

protected int getMeasuredRuns() {
	return 3;
}

}