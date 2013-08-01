/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2007-2013 Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */

package org.sonatype.nexus.yum.internal.task;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.sonatype.nexus.scheduling.AbstractNexusTask;
import org.sonatype.scheduling.ScheduledTask;
import org.sonatype.sisu.goodies.eventbus.EventBus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named("WaitTask")
public class WaitTask
    extends AbstractNexusTask<Object>
{

  public static final Logger LOG = LoggerFactory.getLogger(WaitTask.class);

  @Inject
  public WaitTask(final EventBus eventBus) {
    super(eventBus, null);
  }

  @Override
  protected Object doRun()
      throws Exception
  {
    LOG.debug("Go to sleep for a sec.");
    Thread.sleep(1000);
    return null;
  }

  @Override
  public boolean allowConcurrentExecution(Map<String, List<ScheduledTask<?>>> activeTasks) {
    return true;
  }

  @Override
  protected String getAction() {
    return "Wait";
  }

  @Override
  protected String getMessage() {
    return "Wait";
  }

}
