/*
 * Copyright 2005 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.event;

import org.drools.WorkingMemory;

public class DefaultAgendaEventListener
    implements
    AgendaEventListener {
    public DefaultAgendaEventListener() {
        // intentionally left blank
    }

    public void activationCreated(final ActivationCreatedEvent event,
                                  final WorkingMemory workingMemory) {
        // intentionally left blank
    }

    public void activationCancelled(final ActivationCancelledEvent event,
                                    final WorkingMemory workingMemory) {
        // intentionally left blank
    }

    public void beforeActivationFired(final BeforeActivationFiredEvent event,
                                      final WorkingMemory workingMemory) {
        // intentionally left blank
    }

    public void afterActivationFired(final AfterActivationFiredEvent event,
                                     final WorkingMemory workingMemory) {
        // intentionally left blank
    }

    public void agendaGroupPopped(final AgendaGroupPoppedEvent event,
                                  final WorkingMemory workingMemory) {
        // intentionally left blank
    }

    public void agendaGroupPushed(final AgendaGroupPushedEvent event,
                                  final WorkingMemory workingMemory) {
        // intentionally left blank
    }

    public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event,
                                            WorkingMemory workingMemory) {
        // intentionally left blank
    }

    public void afterRuleFlowGroupDeactivated(
            RuleFlowGroupDeactivatedEvent event, WorkingMemory workingMemory) {
        // intentionally left blank
    }

    public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event,
                                             WorkingMemory workingMemory) {
        // intentionally left blank
    }

    public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event,
                                               WorkingMemory workingMemory) {
        // intentionally left blank
    }
}