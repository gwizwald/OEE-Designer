package org.point85.app.monitor;

import org.point85.domain.messaging.CollectorNotificationMessage;
import org.point85.domain.messaging.NotificationSeverity;

public class CollectorNotification extends AbstractNotification {

	private NotificationSeverity severity;
	private String text;

	public CollectorNotification(CollectorNotificationMessage message) {
		super(message);
		this.severity = message.getSeverity();
		this.text = message.getText();
	}

	public NotificationSeverity getSeverity() {
		return severity;
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return super.toString() + ", severity: " + severity + ", message: " + text;
	}
}